package com.vueblog.common.exception;

import com.vueblog.common.lang.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExcepitonHandler {

    /**
     * 运行异常
     * @param e
     * @return
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = RuntimeException.class)
    public ResultVO handler(RuntimeException e){
        log.error("运行时异常：-------{}",e);
        return new ResultVO<>("-1",e.getMessage());
    }

    /**
     * assert校验异常
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = IllegalArgumentException.class)
    public ResultVO handler(IllegalArgumentException e){
        log.error("assert校验异常：-------{}",e);
        return new ResultVO<>("400", e.getMessage());
    }

    /**
     * 实体校验异常
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResultVO handler(MethodArgumentNotValidException e){
        log.error("实体校验异常：-------{}",e);
        BindingResult bindingResult = e.getBindingResult();
        ObjectError objectError = bindingResult.getAllErrors().stream().findFirst().get();
        return new ResultVO<>("400",objectError.getDefaultMessage());
    }
}
