/*
    Subnet Solver v1.0.0 (https://github.com/vittorioPiotti/Subnet-Solver-Java/releases/tag/1.0.0)
    Copyright 2024 Vittorio Piotti
    Licensed under GPL-3.0 (https://github.com/vittorioPiotti/Subnet-Solver-Java/blob/main/LICENSE.md)
*/

/*
    batik-all v1.17 (https://xmlgraphics.apache.org/batik/download.html)
    Copyright 2024 The Apache Software Foundation
    Licensed under Apache License 2.0 (https://xmlgraphics.apache.org/batik/license.html)
*/


/*
    FlatLaf v3.2.5 (https://github.com/JFormDesigner/FlatLaf/releases/tag/3.2.5)
    Copyright 2024 JFormDesigner GmbH
    Licensed under Apache License 2.0 (https://github.com/JFormDesigner/FlatLaf/blob/main/LICENSE)
*/

/*
    xml-apis-ext v1.3.04 (https://xmlgraphics.apache.org/batik/download.html)
    Part of Apache Batik (https://xmlgraphics.apache.org/batik/)
    Copyright 2024 The Apache Software Foundation
    Licensed under Apache License 2.0 (https://xmlgraphics.apache.org/batik/license.html)
*/

/*
    xmlgraphics-commons v2.9 (https://xmlgraphics.apache.org/batik/download.html)
    Part of Apache Batik (https://xmlgraphics.apache.org/batik/)
    Copyright 2024 The Apache Software Foundation
    Licensed under Apache License 2.0 (https://xmlgraphics.apache.org/batik/license.html)
*/

/*!
  * Bootstrap v5.3.0-alpha3 (https://getbootstrap.com/)
  * Copyright 2011-2023 The Bootstrap Authors (https://github.com/twbs/bootstrap/graphs/contributors)
  * Licensed under MIT (https://github.com/twbs/bootstrap/blob/main/LICENSE)
*/

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CalcIP {

    public static void main(String[] args) throws UnknownHostException {
        // Esempi di indirizzi IP
        String[] ipAddresses = {
            "10.0.0.1",
            "172.16.0.1",
            "192.168.1.1",
            "8.8.8.8",
            "169.254.0.1",
            "224.0.0.1"
        };

        for (String ipAddress : ipAddresses) {
            ObjIP objIP = CalcIP.calculateIPInfo(ipAddress);
            System.out.println(objIP);
        }
    }

    public static ObjIP calculateIPInfo(String ipAddress) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName(ipAddress);
        byte[] ipBytes = inetAddress.getAddress();

        String type = determineIPType(ipBytes);
        String ipClass = determineIPClass(ipBytes);

        return new ObjIP(ipAddress, type, ipClass);
    }

    public static String determineIPType(byte[] ipBytes) {
        int firstByte = ipBytes[0] & 0xFF;

        // Verifica degli indirizzi IP privati
        if ((firstByte == 10) ||
            (firstByte == 172 && (ipBytes[1] & 0xF0) == 16) ||
            (firstByte == 192 && (ipBytes[1] & 0xFF) == 168)) {
            return "Privato";
        }

        // Verifica degli indirizzi APIPA
        if (firstByte == 169 && (ipBytes[1] & 0xFF) == 254) {
            return "Indefinito";
        }

        // Verifica degli indirizzi multicast
        if (firstByte >= 224 && firstByte <= 239) {
            return "Indefinito";
        }

        // Se non è né privato né APIPA, allora è pubblico
        return "Pubblico";
    }

    public static String determineIPClass(byte[] ipBytes) {
        int firstByte = ipBytes[0] & 0xFF;

        if (firstByte >= 1 && firstByte <= 126) {
            return "A";
        } else if (firstByte >= 128 && firstByte <= 191) {
            return "B";
        } else if (firstByte >= 192 && firstByte <= 223) {
            return "C";
        } else {
            return "Indefinito";
        }
    }
}

