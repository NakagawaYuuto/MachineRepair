package Task7.MachineRepairGuidance.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Controller
public class HomeController {

    @GetMapping(value = "")
    public String Start(){
        return "始め";
    }

    @GetMapping(value = "home")
    public String Home(){
        return "home";
//                """
//                農機具の修理手引きwebです。
//                小物関係の修理方法がわかります。
//                現在時刻は%sです。
//
//                <br>
//                <button type="button">刈り払い機</button>
//                <br>
//                <button type="button">動力噴霧器</button>
//                <br>
//                <button type="button">動力散布機</button>
//
//                <button type="reset">リセット</button>
//                """.formatted(LocalDateTime.now()
    }
}
