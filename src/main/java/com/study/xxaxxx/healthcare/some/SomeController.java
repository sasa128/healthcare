package com.study.xxaxxx.healthcare.some;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * SomeControllerは、特定の機能を提供するコントローラークラスです。
 */
@Controller
public class SomeController {
    /**
     * とある処理を行うサービスです。
     */
    // @Autowired
    // private SomeService someService;


    /**
     * 特定の機能を提供するメソッドです。
     *
     * <p>このメソッドは、特定の機能を実行し、結果を返します。
     *
     * @param param リクエストパラメータ
     * @return 処理結果の文字列
     */
    // ここに特定の機能を提供するメソッドを実装します。
    @GetMapping("/some")
    public String getSomething() {
        return "/some/something"; // ここで返すテンプレートのパスを指定します
    }
    

}
