package com.bumptech.glide;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12548a;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map f12549a = new HashMap();

        a() {
        }

        e b() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.f12548a = DesugarCollections.unmodifiableMap(new HashMap(aVar.f12549a));
    }

    public boolean a(Class cls) {
        return this.f12548a.containsKey(cls);
    }
}
