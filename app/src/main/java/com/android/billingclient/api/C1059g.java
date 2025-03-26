package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.billingclient.api.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1059g {

    /* renamed from: a, reason: collision with root package name */
    private String f12443a;

    /* renamed from: b, reason: collision with root package name */
    private List f12444b;

    /* renamed from: com.android.billingclient.api.g$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f12445a;

        /* renamed from: b, reason: collision with root package name */
        private List f12446b;

        /* synthetic */ a(E1.E e8) {
        }

        public C1059g a() {
            String str = this.f12445a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f12446b == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            C1059g c1059g = new C1059g();
            c1059g.f12443a = str;
            c1059g.f12444b = this.f12446b;
            return c1059g;
        }

        public a b(List list) {
            this.f12446b = new ArrayList(list);
            return this;
        }

        public a c(String str) {
            this.f12445a = str;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f12443a;
    }

    public List b() {
        return this.f12444b;
    }
}
