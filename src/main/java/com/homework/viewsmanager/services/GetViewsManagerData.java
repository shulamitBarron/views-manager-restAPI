package com.homework.viewsmanager.services;

import com.homework.viewsmanager.beans.DataResponse;
import com.homework.viewsmanager.properties.ViewsManagerConfiguration;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetViewsManagerData {
    private final ViewsManagerConfiguration viewsManagerConfiguration;

    public DataResponse get() {
        return DataResponse.builder()
                .components(viewsManagerConfiguration.getComponents())
                .views(viewsManagerConfiguration.getViews())
                .build();
    }
}
