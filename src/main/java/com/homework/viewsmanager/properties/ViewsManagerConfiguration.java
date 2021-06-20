package com.homework.viewsmanager.properties;

import com.homework.viewsmanager.beans.ComponentEntity;
import com.homework.viewsmanager.beans.LayoutView;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "views-manager-configuration")
public class ViewsManagerConfiguration {
    List<LayoutView> views;
    List<ComponentEntity> components;
}
