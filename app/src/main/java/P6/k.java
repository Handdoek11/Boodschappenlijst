package P6;

import java.util.NoSuchElementException;
import y6.AbstractC6969H;

/* loaded from: classes2.dex */
public final class k extends AbstractC6969H {

    /* renamed from: o, reason: collision with root package name */
    private final long f4436o;

    /* renamed from: s, reason: collision with root package name */
    private final long f4437s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4438t;

    /* renamed from: u, reason: collision with root package name */
    private long f4439u;

    public k(long j8, long j9, long j10) {
        this.f4436o = j10;
        this.f4437s = j9;
        boolean z7 = false;
        if (j10 <= 0 ? j8 >= j9 : j8 <= j9) {
            z7 = true;
        }
        this.f4438t = z7;
        this.f4439u = z7 ? j8 : j9;
    }

    @Override // y6.AbstractC6969H
    public long a() {
        long j8 = this.f4439u;
        if (j8 != this.f4437s) {
            this.f4439u = this.f4436o + j8;
        } else {
            if (!this.f4438t) {
                throw new NoSuchElementException();
            }
            this.f4438t = false;
        }
        return j8;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4438t;
    }
}
