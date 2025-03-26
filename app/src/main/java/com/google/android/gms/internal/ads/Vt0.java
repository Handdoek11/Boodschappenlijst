package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class Vt0 implements InterfaceC3762pv0 {
    private static void l(Iterable iterable, List list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof Av0) {
                ((Av0) list).d(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    q(list, size2);
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
                q(list, size2);
            }
            list.add(obj2);
        }
    }

    protected static zzhag m(InterfaceC3871qv0 interfaceC3871qv0) {
        return new zzhag(interfaceC3871qv0);
    }

    protected static void p(Iterable iterable, List list) {
        byte[] bArr = AbstractC2131av0.f20783b;
        iterable.getClass();
        if (!(iterable instanceof InterfaceC2456dv0)) {
            if (iterable instanceof InterfaceC4742yv0) {
                list.addAll((Collection) iterable);
                return;
            } else {
                l(iterable, list);
                return;
            }
        }
        List zza = ((InterfaceC2456dv0) iterable).zza();
        InterfaceC2456dv0 interfaceC2456dv0 = (InterfaceC2456dv0) list;
        int size = list.size();
        for (Object obj : zza) {
            if (obj == null) {
                String str = "Element at index " + (interfaceC2456dv0.size() - size) + " is null.";
                int size2 = interfaceC2456dv0.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    interfaceC2456dv0.remove(size2);
                }
            } else if (obj instanceof AbstractC3542nu0) {
                interfaceC2456dv0.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                AbstractC3542nu0.H(bArr2, 0, bArr2.length);
                interfaceC2456dv0.zzb();
            } else {
                interfaceC2456dv0.add((String) obj);
            }
        }
    }

    private static void q(List list, int i8) {
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

    public Vt0 i(byte[] bArr, Eu0 eu0) {
        return k(bArr, 0, bArr.length, eu0);
    }

    public abstract Vt0 k(byte[] bArr, int i8, int i9, Eu0 eu0);
}
