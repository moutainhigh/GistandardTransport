
package com.gistandard.transport.pay.webservice.generalAcct;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2016-08-11T16:15:53.488+08:00
 * Generated source version: 3.1.2
 * 
 */
public final class GeneralAcctWebService_GeneralAcctWebServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://webService.external.giifiCalc.transport.gistandard.com/", "GeneralAcctWebServiceImplService");

    private GeneralAcctWebService_GeneralAcctWebServiceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = GeneralAcctWebServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        GeneralAcctWebServiceImplService ss = new GeneralAcctWebServiceImplService(wsdlURL, SERVICE_NAME);
        GeneralAcctWebService port = ss.getGeneralAcctWebServiceImplPort();

        {
        System.out.println("Invoking queryMSInAndOut...");
        String _queryMSInAndOut_gFUserCode = "";
        String _queryMSInAndOut_beginDate = "";
        String _queryMSInAndOut_endDate = "";
        String _queryMSInAndOut_payFlag = "";
        int _queryMSInAndOut_startRecord = 0;
        int _queryMSInAndOut_pageSize = 0;
        String _queryMSInAndOut__return = port.queryMSInAndOut(_queryMSInAndOut_gFUserCode, _queryMSInAndOut_beginDate, _queryMSInAndOut_endDate, _queryMSInAndOut_payFlag, _queryMSInAndOut_startRecord, _queryMSInAndOut_pageSize);
        System.out.println("queryMSInAndOut.result=" + _queryMSInAndOut__return);


        }

        System.exit(0);
    }

}