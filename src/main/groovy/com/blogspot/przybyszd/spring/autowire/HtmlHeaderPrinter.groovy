package com.blogspot.przybyszd.spring.autowire

import org.springframework.stereotype.Component

@Component
class HtmlHeaderPrinter implements IHeaderPrinter{
    @Override
    String printHeader(String header) {
        return "<h1>$header</h1>"
    }
}
