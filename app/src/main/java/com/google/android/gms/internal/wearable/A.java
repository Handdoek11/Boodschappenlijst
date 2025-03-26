package com.google.android.gms.internal.wearable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class A implements H0 {
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

    protected static void f(Iterable iterable, List list) {
        byte[] bArr = AbstractC5269s0.f30213b;
        iterable.getClass();
        if (!(iterable instanceof InterfaceC5275v0)) {
            if (iterable instanceof P0) {
                list.addAll((Collection) iterable);
                return;
            }
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
            if (list instanceof S0) {
                ((S0) list).d(list.size() + size);
            }
            int size2 = list.size();
            if (!(iterable instanceof RandomAccess)) {
                for (Object obj : iterable) {
                    if (obj == null) {
                        c(list, size2);
                    }
                    list.add(obj);
                }
                return;
            }
            List list2 = (List) iterable;
            int size3 = list2.size();
            for (int i8 = 0; i8 < size3; i8++) {
                Object obj2 = list2.get(i8);
                if (obj2 == null) {
                    c(list, size2);
                }
                list.add(obj2);
            }
            return;
        }
        List zza = ((InterfaceC5275v0) iterable).zza();
        InterfaceC5275v0 interfaceC5275v0 = (InterfaceC5275v0) list;
        int size4 = list.size();
        for (Object obj3 : zza) {
            if (obj3 == null) {
                String str = "Element at index " + (interfaceC5275v0.size() - size4) + " is null.";
                int size5 = interfaceC5275v0.size();
                while (true) {
                    size5--;
                    if (size5 < size4) {
                        throw new NullPointerException(str);
                    }
                    interfaceC5275v0.remove(size5);
                }
            } else if (obj3 instanceof Q) {
                interfaceC5275v0.zzb();
            } else if (obj3 instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj3;
                Q.r(bArr2, 0, bArr2.length);
                interfaceC5275v0.zzb();
            } else {
                interfaceC5275v0.add((String) obj3);
            }
        }
    }
}
