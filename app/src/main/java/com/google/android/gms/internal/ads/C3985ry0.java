package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ry0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3985ry0 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f26510a;

    /* renamed from: b, reason: collision with root package name */
    private final List f26511b;

    static {
        C2571ey0.a(Collections.emptySet());
    }

    /* synthetic */ C3985ry0(List list, List list2, AbstractC3768py0 abstractC3768py0) {
        this.f26510a = list;
        this.f26511b = list2;
    }

    public static C3877qy0 a(int i8, int i9) {
        return new C3877qy0(i8, i9, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.f26510a.size();
        ArrayList arrayList = new ArrayList(this.f26511b.size());
        int size2 = this.f26511b.size();
        for (int i8 = 0; i8 < size2; i8++) {
            Collection collection = (Collection) ((InterfaceC3441my0) this.f26511b.get(i8)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet a8 = AbstractC2137ay0.a(size);
        int size3 = this.f26510a.size();
        for (int i9 = 0; i9 < size3; i9++) {
            Object zzb = ((InterfaceC3441my0) this.f26510a.get(i9)).zzb();
            zzb.getClass();
            a8.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i10 = 0; i10 < size4; i10++) {
            for (Object obj : (Collection) arrayList.get(i10)) {
                obj.getClass();
                a8.add(obj);
            }
        }
        return DesugarCollections.unmodifiableSet(a8);
    }
}
