package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class To0 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f19173a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private Qo0 f19174b = Qo0.f18535b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f19175c = null;

    public final To0 a(Uk0 uk0, int i8, String str, String str2) {
        ArrayList arrayList = this.f19173a;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new Uo0(uk0, i8, str, str2, null));
        return this;
    }

    public final To0 b(Qo0 qo0) {
        if (this.f19173a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.f19174b = qo0;
        return this;
    }

    public final To0 c(int i8) {
        if (this.f19173a == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.f19175c = Integer.valueOf(i8);
        return this;
    }

    public final Wo0 d() {
        if (this.f19173a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.f19175c;
        if (num != null) {
            int intValue = num.intValue();
            ArrayList arrayList = this.f19173a;
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                int a8 = ((Uo0) arrayList.get(i8)).a();
                i8++;
                if (a8 == intValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        Wo0 wo0 = new Wo0(this.f19174b, DesugarCollections.unmodifiableList(this.f19173a), this.f19175c, null);
        this.f19173a = null;
        return wo0;
    }
}
