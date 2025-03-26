package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.zh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4823zh0 {
    public static Object a(Iterable iterable, Object obj) {
        AbstractC4825zi0 it = ((C3736pi0) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static boolean b(Iterable iterable, InterfaceC1797Tf0 interfaceC1797Tf0) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            interfaceC1797Tf0.getClass();
            return d((List) iterable, interfaceC1797Tf0);
        }
        Iterator it = iterable.iterator();
        interfaceC1797Tf0.getClass();
        boolean z7 = false;
        while (it.hasNext()) {
            if (interfaceC1797Tf0.a(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    private static void c(List list, InterfaceC1797Tf0 interfaceC1797Tf0, int i8, int i9) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i9) {
                break;
            } else if (interfaceC1797Tf0.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i9--;
            if (i9 < i8) {
                return;
            } else {
                list.remove(i9);
            }
        }
    }

    private static boolean d(List list, InterfaceC1797Tf0 interfaceC1797Tf0) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < list.size()) {
            Object obj = list.get(i8);
            if (!interfaceC1797Tf0.a(obj)) {
                if (i8 > i9) {
                    try {
                        list.set(i9, obj);
                    } catch (IllegalArgumentException unused) {
                        c(list, interfaceC1797Tf0, i9, i8);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        c(list, interfaceC1797Tf0, i9, i8);
                        return true;
                    }
                }
                i9++;
            }
            i8++;
        }
        list.subList(i9, list.size()).clear();
        return i8 != i9;
    }
}
