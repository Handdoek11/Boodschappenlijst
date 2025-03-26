package com.headcode.ourgroceries.android;

import android.view.ContextMenu;
import com.headcode.ourgroceries.android.C5536e3;
import p5.C6395a;

/* renamed from: com.headcode.ourgroceries.android.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5544f3 {
    public static boolean a(C5536e3.d dVar, C6395a c6395a, C5536e3.g gVar, int i8, Object obj) {
        return false;
    }

    public static C5536e3.d.a b(C5536e3.d dVar) {
        return C5536e3.d.a.NONE;
    }

    public static int c(C5536e3.d dVar, C6395a c6395a, int i8, Object obj) {
        if (obj instanceof p5.c) {
            return ((p5.c) obj).e() ? 7 : 0;
        }
        if (obj instanceof p5.g) {
            return 4;
        }
        if (obj instanceof p5.f) {
            return 9;
        }
        if (obj instanceof p5.e) {
            return ((p5.e) obj).a() > 0 ? 1 : 5;
        }
        if (obj instanceof Z0) {
            return dVar.A(c6395a, i8, (Z0) obj);
        }
        if (obj instanceof String) {
            return 5;
        }
        throw new AssertionError("Unknown object at position " + i8 + ": " + obj);
    }

    public static int d(C5536e3.d dVar, C6395a c6395a, int i8, Z0 z02) {
        throw new AssertionError();
    }

    public static String e(C5536e3.d dVar, C6395a c6395a, int i8, Z0 z02) {
        return null;
    }

    public static String f(C5536e3.d dVar, C6395a c6395a, int i8, String str) {
        return null;
    }

    public static String g(C5536e3.d dVar, C6395a c6395a, int i8, Object obj) {
        if (obj instanceof p5.c) {
            p5.c cVar = (p5.c) obj;
            String b8 = cVar.b();
            if (!cVar.d()) {
                return b8;
            }
            return b8 + '*';
        }
        if (obj instanceof p5.g) {
            return ((p5.g) obj).a();
        }
        if (obj instanceof p5.f) {
            return ((p5.f) obj).a();
        }
        if (obj instanceof Z0) {
            Z0 z02 = (Z0) obj;
            StringBuilder sb = new StringBuilder(25);
            sb.append(z02.w());
            if (z02.P()) {
                sb.append('*');
            }
            return sb.toString();
        }
        if (obj instanceof p5.e) {
            return ((p5.e) obj).b();
        }
        throw new AssertionError("Unknown object at position " + i8 + ": " + obj);
    }

    public static boolean h(C5536e3.d dVar, C6395a c6395a, int i8, String str) {
        throw new AssertionError();
    }

    public static boolean i(C5536e3.d dVar, C6395a c6395a, int i8, Z0 z02) {
        throw new AssertionError();
    }

    public static void j(C5536e3.d dVar, Object obj) {
        throw new AssertionError();
    }

    public static void k(C5536e3.d dVar, Object obj, boolean z7) {
        throw new AssertionError();
    }

    public static void l(C5536e3.d dVar, Object obj, ContextMenu contextMenu) {
        throw new AssertionError();
    }

    public static void m(C5536e3.d dVar, C6395a c6395a, int i8) {
        throw new AssertionError();
    }

    public static boolean p(C5536e3.d dVar, Object obj) {
        return false;
    }

    public static void q(C5536e3.d dVar, C6395a c6395a, int i8, int i9) {
        throw new AssertionError();
    }

    public static void r(C5536e3.d dVar, Object obj) {
        throw new AssertionError();
    }

    public static boolean s(C5536e3.d dVar, int i8) {
        return false;
    }

    public static void n(C5536e3.d dVar) {
    }

    public static void o(C5536e3.d dVar) {
    }
}
