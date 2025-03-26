package P6;

import J6.r;
import java.util.NoSuchElementException;
import y6.AbstractC6986n;

/* loaded from: classes2.dex */
public final class b extends AbstractC6986n {

    /* renamed from: o, reason: collision with root package name */
    private final int f4414o;

    /* renamed from: s, reason: collision with root package name */
    private final int f4415s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4416t;

    /* renamed from: u, reason: collision with root package name */
    private int f4417u;

    public b(char c8, char c9, int i8) {
        this.f4414o = i8;
        this.f4415s = c9;
        boolean z7 = false;
        if (i8 <= 0 ? r.f(c8, c9) >= 0 : r.f(c8, c9) <= 0) {
            z7 = true;
        }
        this.f4416t = z7;
        this.f4417u = z7 ? c8 : c9;
    }

    @Override // y6.AbstractC6986n
    public char a() {
        int i8 = this.f4417u;
        if (i8 != this.f4415s) {
            this.f4417u = this.f4414o + i8;
        } else {
            if (!this.f4416t) {
                throw new NoSuchElementException();
            }
            this.f4416t = false;
        }
        return (char) i8;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4416t;
    }
}
