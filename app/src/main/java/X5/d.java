package X5;

import java.io.EOFException;

/* loaded from: classes2.dex */
public abstract class d {
    public static final Void a(int i8, int i9) {
        throw new EOFException("Unable to discard " + i8 + " bytes: only " + i9 + " available for writing");
    }

    public static final Void b(int i8, int i9) {
        throw new EOFException("Unable to discard " + i8 + " bytes: only " + i9 + " available for reading");
    }

    public static final void c(a aVar, int i8) {
        J6.r.e(aVar, "<this>");
        throw new IllegalArgumentException("End gap " + i8 + " is too big: capacity is " + aVar.f());
    }

    public static final void d(a aVar, int i8) {
        J6.r.e(aVar, "<this>");
        throw new IllegalArgumentException("Unable to reserve end gap " + i8 + ": there are already " + (aVar.k() - aVar.i()) + " content bytes at offset " + aVar.i());
    }

    public static final void e(a aVar, int i8) {
        J6.r.e(aVar, "<this>");
        throw new IllegalArgumentException("End gap " + i8 + " is too big: there are already " + aVar.j() + " bytes reserved in the beginning");
    }

    public static final void f(a aVar, int i8) {
        J6.r.e(aVar, "<this>");
        aVar.o(aVar.i() - i8);
    }

    public static final Void g(a aVar, int i8) {
        J6.r.e(aVar, "<this>");
        throw new IllegalStateException("Unable to reserve " + i8 + " start gap: there are already " + (aVar.k() - aVar.i()) + " content bytes starting at offset " + aVar.i());
    }

    public static final Void h(a aVar, int i8) {
        J6.r.e(aVar, "<this>");
        if (i8 > aVar.f()) {
            throw new IllegalArgumentException("Start gap " + i8 + " is bigger than the capacity " + aVar.f());
        }
        throw new IllegalStateException("Unable to reserve " + i8 + " start gap: there are already " + (aVar.f() - aVar.g()) + " bytes reserved in the end");
    }
}
