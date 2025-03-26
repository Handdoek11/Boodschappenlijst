package io.ktor.utils.io.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f36911b = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availableForRead$internal");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f36912c = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availableForWrite$internal");

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f36913d = AtomicIntegerFieldUpdater.newUpdater(h.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;

    /* renamed from: a, reason: collision with root package name */
    private final int f36914a;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public h(int i8) {
        this.f36914a = i8;
        this._availableForWrite$internal = i8;
    }

    private final Void b(int i8, int i9, int i10) {
        throw new IllegalArgumentException("Completed read overflow: " + i8 + " + " + i10 + " = " + i9 + " > " + this.f36914a);
    }

    private final Void d(int i8, int i9) {
        throw new IllegalArgumentException("Complete write overflow: " + i8 + " + " + i9 + " > " + this.f36914a);
    }

    public final void a(int i8) {
        int i9;
        int i10;
        do {
            i9 = this._availableForWrite$internal;
            i10 = i9 + i8;
            if (i10 > this.f36914a) {
                b(i9, i10, i8);
                throw new KotlinNothingValueException();
            }
        } while (!f36912c.compareAndSet(this, i9, i10));
    }

    public final void c(int i8) {
        int i9;
        int i10;
        do {
            i9 = this._pendingToFlush;
            i10 = i9 + i8;
            if (i10 > this.f36914a) {
                d(i9, i8);
                throw new KotlinNothingValueException();
            }
        } while (!f36913d.compareAndSet(this, i9, i10));
    }

    public final boolean e() {
        int andSet = f36913d.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : f36911b.addAndGet(this, andSet) > 0;
    }

    public final void f() {
        f36912c.getAndSet(this, 0);
    }

    public final boolean g() {
        return this._availableForWrite$internal == this.f36914a;
    }

    public final boolean h() {
        return this._availableForWrite$internal == 0;
    }

    public final void i() {
        this._availableForRead$internal = this.f36914a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final void j() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.f36914a;
    }

    public final boolean k() {
        int i8;
        do {
            i8 = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i8 != this.f36914a) {
                return false;
            }
        } while (!f36912c.compareAndSet(this, i8, 0));
        return true;
    }

    public final int l(int i8) {
        int i9;
        int min;
        do {
            i9 = this._availableForRead$internal;
            min = Math.min(i8, i9);
            if (min == 0) {
                return 0;
            }
        } while (!f36911b.compareAndSet(this, i9, i9 - min));
        return Math.min(i8, i9);
    }

    public final boolean m(int i8) {
        int i9;
        do {
            i9 = this._availableForRead$internal;
            if (i9 < i8) {
                return false;
            }
        } while (!f36911b.compareAndSet(this, i9, i9 - i8));
        return true;
    }

    public final int n(int i8) {
        int i9;
        int min;
        do {
            i9 = this._availableForWrite$internal;
            min = Math.min(i8, i9);
            if (min == 0) {
                return 0;
            }
        } while (!f36912c.compareAndSet(this, i9, i9 - min));
        return Math.min(i8, i9);
    }

    public String toString() {
        return "RingBufferCapacity[read: " + this._availableForRead$internal + ", write: " + this._availableForWrite$internal + ", flush: " + this._pendingToFlush + ", capacity: " + this.f36914a + ']';
    }
}
