package c4;

import java.util.NoSuchElementException;

/* renamed from: c4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0999b extends S {

    /* renamed from: o, reason: collision with root package name */
    private EnumC0208b f12165o = EnumC0208b.NOT_READY;

    /* renamed from: s, reason: collision with root package name */
    private Object f12166s;

    /* renamed from: c4.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12167a;

        static {
            int[] iArr = new int[EnumC0208b.values().length];
            f12167a = iArr;
            try {
                iArr[EnumC0208b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12167a[EnumC0208b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: c4.b$b, reason: collision with other inner class name */
    private enum EnumC0208b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC0999b() {
    }

    private boolean c() {
        this.f12165o = EnumC0208b.FAILED;
        this.f12166s = a();
        if (this.f12165o == EnumC0208b.DONE) {
            return false;
        }
        this.f12165o = EnumC0208b.READY;
        return true;
    }

    protected abstract Object a();

    protected final Object b() {
        this.f12165o = EnumC0208b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b4.h.n(this.f12165o != EnumC0208b.FAILED);
        int i8 = a.f12167a[this.f12165o.ordinal()];
        if (i8 == 1) {
            return false;
        }
        if (i8 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12165o = EnumC0208b.NOT_READY;
        Object a8 = AbstractC0996E.a(this.f12166s);
        this.f12166s = null;
        return a8;
    }
}
