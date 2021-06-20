package com.homework.viewsmanager.beans;

import lombok.Data;

import java.util.List;

@Data
public class LayoutView {
    String id;
    String name;
    List<ComponentLayout> componentLayout;
}
