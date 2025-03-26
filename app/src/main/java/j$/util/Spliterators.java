package j$.util;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Spliterators {

    /* renamed from: a, reason: collision with root package name */
    private static final Spliterator f37264a = new p0();

    /* renamed from: b, reason: collision with root package name */
    private static final Y f37265b = new n0();

    /* renamed from: c, reason: collision with root package name */
    private static final b0 f37266c = new o0();

    /* renamed from: d, reason: collision with root package name */
    private static final V f37267d = new m0();

    public static Spliterator e() {
        return f37264a;
    }

    public static Y c() {
        return f37265b;
    }

    public static b0 d() {
        return f37266c;
    }

    public static V b() {
        return f37267d;
    }

    public static Spliterator m(Object[] objArr, int i8, int i9) {
        a(((Object[]) Objects.requireNonNull(objArr)).length, i8, i9);
        return new k0(objArr, i8, i9, 1040);
    }

    public static Y k(int[] iArr, int i8, int i9) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i8, i9);
        return new q0(iArr, i8, i9, 1040);
    }

    public static b0 l(long[] jArr, int i8, int i9) {
        a(((long[]) Objects.requireNonNull(jArr)).length, i8, i9);
        return new s0(jArr, i8, i9, 1040);
    }

    public static V j(double[] dArr, int i8, int i9) {
        a(((double[]) Objects.requireNonNull(dArr)).length, i8, i9);
        return new l0(dArr, i8, i9, 1040);
    }

    private static void a(int i8, int i9, int i10) {
        if (i9 <= i10) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException(i9);
            }
            if (i10 > i8) {
                throw new ArrayIndexOutOfBoundsException(i10);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i9 + ") > fence(" + i10 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i8) {
        return new r0((java.util.Collection) Objects.requireNonNull(collection), i8);
    }

    public static Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new g0(spliterator);
    }

    public static L g(Y y7) {
        Objects.requireNonNull(y7);
        return new h0(y7);
    }

    public static P h(b0 b0Var) {
        Objects.requireNonNull(b0Var);
        return new i0(b0Var);
    }

    public static H f(V v7) {
        Objects.requireNonNull(v7);
        return new j0(v7);
    }
}
