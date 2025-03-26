package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class D3 implements V4 {
    protected static void l(Iterable iterable, List list) {
        AbstractC5026t4.e(iterable);
        if (iterable instanceof D4) {
            List zza = ((D4) iterable).zza();
            D4 d42 = (D4) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    String str = "Element at index " + (d42.size() - size) + " is null.";
                    for (int size2 = d42.size() - 1; size2 >= size; size2--) {
                        d42.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof K3) {
                    d42.z0((K3) obj);
                } else if (obj instanceof byte[]) {
                    d42.z0(K3.o((byte[]) obj));
                } else {
                    d42.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC4920g5) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof C4929h5) {
                ((C4929h5) list).c(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m(list, size4);
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
                m(list, size4);
            }
            list.add(obj3);
        }
    }

    private static void m(List list, int i8) {
        String str = "Element at index " + (list.size() - i8) + " is null.";
        for (int size = list.size() - 1; size >= i8; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final /* synthetic */ V4 a(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public abstract /* synthetic */ Object clone();

    public abstract D3 i(byte[] bArr, int i8, int i9);

    public abstract D3 k(byte[] bArr, int i8, int i9, C4901e4 c4901e4);

    @Override // com.google.android.gms.internal.measurement.V4
    public final /* synthetic */ V4 o(byte[] bArr, C4901e4 c4901e4) {
        return k(bArr, 0, bArr.length, c4901e4);
    }
}
