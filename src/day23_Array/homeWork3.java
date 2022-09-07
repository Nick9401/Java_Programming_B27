package day23_Array;

import java.util.Arrays;

public class homeWork3 {
     /* Given some urls determine how many .com, .org, and .edu websites there are. Also keep track of an ‘other’ category for websites that have a different domain

        Sample websites for an array:
        bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com, nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com, comcast.net, tamu.edu, utexas.edu
     */

    public static void main(String[] args) {

        String[] webSites = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"} ;

        System.out.println(Arrays.toString(webSites));

        int comCount = 0, orgCount = 0, eduCount = 0, otherCount = 0;

        for (String webSite : webSites) {

            if (webSite.endsWith(".com")) {
                comCount ++;
            } else if (webSite.endsWith(".org")) {
                orgCount ++;
            } else if (webSite.endsWith(".edu")) {
                eduCount ++;
            } else {
                otherCount ++;
            }

        }
        System.out.println("comCount = " + comCount);
        System.out.println("orgCount = " + orgCount);
        System.out.println("eduCount = " + eduCount);
        System.out.println("otherCount = " + otherCount);

    }

}
