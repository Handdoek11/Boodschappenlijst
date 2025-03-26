package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12439a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12440b;

    /* renamed from: com.android.billingclient.api.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f12441a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f12442b;

        private a() {
        }

        public C1058f a() {
            if (!this.f12441a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new C1058f(true, this.f12442b);
        }

        public a b() {
            this.f12441a = true;
            return this;
        }
    }

    private C1058f(boolean z7, boolean z8) {
        this.f12439a = z7;
        this.f12440b = z8;
    }

    public static a c() {
        return new a();
    }

    boolean a() {
        return this.f12439a;
    }

    boolean b() {
        return this.f12440b;
    }
}
