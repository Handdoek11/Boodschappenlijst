package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: o, reason: collision with root package name */
    private final List f32722o;

    public DependencyCycleException(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f32722o = list;
    }
}
