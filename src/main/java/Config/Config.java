package Config;


import java.util.Arrays;
import java.util.List;

public class Config {
    App app = new App();
    String database ="jdbc:postgresql://localhost:5432/test";
    Oauth oauth = new Oauth();
    Sparkpost sparkpost = new Sparkpost();
    Google google = new Google();
    Uploadcare uploadcare = new Uploadcare();
    Maildev maildev = new Maildev();
    Github github = new Github();
    Telegram telegram = new Telegram();

    class App {
        String env = "development";
        String secret = "dev-secret";
        String url = "http://localhost:8080";
        Integer port = 8080;
    }

    class Oauth {
        String clientId = "apps.googleusercontent.com";
        String secret = "1111111";
        List<String> adminUsers = Arrays.asList("thundergod@gmail.com", "sedruid@gmail.com");
    }
    class Sparkpost {
        String apiKey = "qqqqq";
        String ipPool = "";
        String returnPath = "bounces@bounces.example.com";
    }
    class Google {
        String analytics = "UA-kkkkkkkkkk";
        String maps = "a;ksmdcsakd";
    }
    class Uploadcare {
        String publicKey = "a;lksdclkdsac";
    }
    class Maildev {
        String host = "127.0.0.1";
        Integer web = 3201;
        Integer smtp = 3202;
        String basePathname = "/mailbox";
    }
    class Github {
        String accessToken = "a;ksmfd;ksadmv";
    }

    class  Telegram {
        String bot = "a;lskjdc;ksamcwacdm";
        String leadsChat = ";asmcsamdc";
    }
}
