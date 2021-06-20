package com.homework.viewsmanager.controllers;

import com.homework.viewsmanager.beans.DataResponse;
import com.homework.viewsmanager.services.GetViewsManagerData;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("views-manager")
public class ViewsManagerController {
    private final GetViewsManagerData getViewsManagerData;

    @GetMapping()
    public DataResponse getPredefinedData() {
        return getViewsManagerData.get();
    }
}