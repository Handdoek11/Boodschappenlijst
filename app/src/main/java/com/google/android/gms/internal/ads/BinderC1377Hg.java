package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1377Hg extends AbstractBinderC1658Pg {

    /* renamed from: A, reason: collision with root package name */
    static final int f15764A;

    /* renamed from: B, reason: collision with root package name */
    static final int f15765B;

    /* renamed from: z, reason: collision with root package name */
    private static final int f15766z;

    /* renamed from: o, reason: collision with root package name */
    private final String f15767o;

    /* renamed from: s, reason: collision with root package name */
    private final List f15768s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private final List f15769t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private final int f15770u;

    /* renamed from: v, reason: collision with root package name */
    private final int f15771v;

    /* renamed from: w, reason: collision with root package name */
    private final int f15772w;

    /* renamed from: x, reason: collision with root package name */
    private final int f15773x;

    /* renamed from: y, reason: collision with root package name */
    private final int f15774y;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f15766z = rgb;
        f15764A = Color.rgb(204, 204, 204);
        f15765B = rgb;
    }

    public BinderC1377Hg(String str, List list, Integer num, Integer num2, Integer num3, int i8, int i9, boolean z7) {
        this.f15767o = str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            BinderC1484Kg binderC1484Kg = (BinderC1484Kg) list.get(i10);
            this.f15768s.add(binderC1484Kg);
            this.f15769t.add(binderC1484Kg);
        }
        this.f15770u = num != null ? num.intValue() : f15764A;
        this.f15771v = num2 != null ? num2.intValue() : f15765B;
        this.f15772w = num3 != null ? num3.intValue() : 12;
        this.f15773x = i8;
        this.f15774y = i9;
    }

    public final int a() {
        return this.f15774y;
    }

    public final int b() {
        return this.f15771v;
    }

    public final int d() {
        return this.f15770u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1693Qg
    public final List e() {
        return this.f15769t;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1693Qg
    public final String g() {
        return this.f15767o;
    }

    public final int u7() {
        return this.f15772w;
    }

    public final List v7() {
        return this.f15768s;
    }

    public final int zzb() {
        return this.f15773x;
    }
}
