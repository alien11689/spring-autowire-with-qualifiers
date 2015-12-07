package com.blogspot.przybyszd.spring.autowire

import org.springframework.stereotype.Component

@Component
class MarkdownHeaderPrinter implements IHeaderPrinter {
    @Override
    String printHeader(String header) {
        return "# $header"
    }
}
