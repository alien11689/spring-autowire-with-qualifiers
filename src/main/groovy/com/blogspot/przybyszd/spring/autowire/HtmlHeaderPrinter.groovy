package com.blogspot.przybyszd.spring.autowire

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class HtmlHeaderPrinter implements IHeaderPrinter{
    @Override
    String printHeader(String header) {
        return "<h1>$header</h1>"
    }
}
