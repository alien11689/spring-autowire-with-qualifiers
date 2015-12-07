package com.blogspot.przybyszd.spring.autowire

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = SpringAutowireWithQualifiersApplication)
class SpringAutowireWithQualifiersApplicationTests {

    @Autowired
    @Qualifier('htmlHeaderPrinter')
    IHeaderPrinter headerPrinter

    @Test
    void shouldPrintHtmlHeader() {
        assert headerPrinter.printHeader('myTitle') == '<h1>myTitle</h1>'
    }

}
