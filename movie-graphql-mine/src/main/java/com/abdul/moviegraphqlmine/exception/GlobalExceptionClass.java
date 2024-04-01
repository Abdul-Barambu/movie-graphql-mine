package com.abdul.moviegraphqlmine.exception;

import graphql.GraphQLError;
import org.springframework.graphql.data.method.annotation.GraphQlExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionClass {

    @GraphQlExceptionHandler
    public GraphQLError handleNotFoundException(NotFoundException ex){
        return GraphQLError.newError()
                .message(ex.getMessage())
                .build();
    }
}
