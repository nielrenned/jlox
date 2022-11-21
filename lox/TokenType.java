package lox;

enum TokenType {
    // Single character tokens
    LEFT_PAREN, RIGHT_PAREN,
    LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, SEMICOLON,
    MINUS, PLUS, SLASH, STAR, PERCENT,
    QUESTION, COLON,

    // One or two character tokens
    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // Literals
    IDENTIFIER, STRING, NUMBER,

    // Keywords
    AND, BREAK, CLASS, ELSE, FALSE, FUN, 
    FOR, IF, NIL, OR, PRINT, RETURN, 
    SUPER, THIS, TRUE, VAR, WHILE,

    // Other
    COMMENT,

    EOF
}