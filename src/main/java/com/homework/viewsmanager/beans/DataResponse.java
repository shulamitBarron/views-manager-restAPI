package com.homework.viewsmanager.beans;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Builder
@Value
public class DataResponse {
    List<LayoutView> views;
    List<ComponentEntity> components;
}
