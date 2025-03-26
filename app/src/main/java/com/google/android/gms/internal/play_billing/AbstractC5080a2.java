package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5080a2 implements InterfaceC5117g3 {
    private static void c(List list, int i8) {
        String str = "Element at index " + (list.size() - i8) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i8) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    protected static void h(Iterable iterable, List list) {
        byte[] bArr = R2.f29810b;
        iterable.getClass();
        if (iterable instanceof T2) {
            List zza = ((T2) iterable).zza();
            T2 t22 = (T2) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    String str = "Element at index " + (t22.size() - size) + " is null.";
                    int size2 = t22.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        t22.remove(size2);
                    }
                } else if (obj instanceof AbstractC5176q2) {
                    t22.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    AbstractC5176q2.q(bArr2, 0, bArr2.length);
                    t22.zzb();
                } else {
                    t22.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC5165o3) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof C5177q3) {
                ((C5177q3) list).d(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    c(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i8 = 0; i8 < size5; i8++) {
            Object obj3 = list2.get(i8);
            if (obj3 == null) {
                c(list, size4);
            }
            list.add(obj3);
        }
    }
}
