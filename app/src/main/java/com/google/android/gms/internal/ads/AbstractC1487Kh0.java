package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.Kh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1487Kh0 {
    public static ArrayList a(int i8) {
        AbstractC1659Pg0.a(i8, "initialArraySize");
        return new ArrayList(i8);
    }

    public static List b(List list, InterfaceC1376Hf0 interfaceC1376Hf0) {
        return list instanceof RandomAccess ? new C1380Hh0(list, interfaceC1376Hf0) : new C1452Jh0(list, interfaceC1376Hf0);
    }
}
