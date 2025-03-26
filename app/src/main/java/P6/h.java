package P6;

import java.util.NoSuchElementException;
import y6.AbstractC6968G;

/* loaded from: classes2.dex */
public final class h extends AbstractC6968G {

    /* renamed from: o, reason: collision with root package name */
    private final int f4426o;

    /* renamed from: s, reason: collision with root package name */
    private final int f4427s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4428t;

    /* renamed from: u, reason: collision with root package name */
    private int f4429u;

    public h(int i8, int i9, int i10) {
        this.f4426o = i10;
        this.f4427s = i9;
        boolean z7 = false;
        if (i10 <= 0 ? i8 >= i9 : i8 <= i9) {
            z7 = true;
        }
        this.f4428t = z7;
        this.f4429u = z7 ? i8 : i9;
    }

    @Override // y6.AbstractC6968G
    public int a() {
        int i8 = this.f4429u;
        if (i8 != this.f4427s) {
            this.f4429u = this.f4426o + i8;
        } else {
            if (!this.f4428t) {
                throw new NoSuchElementException();
            }
            this.f4428t = false;
        }
        return i8;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4428t;
    }
}
