package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class p extends androidx.concurrent.futures.a implements ScheduledFuture {

    /* renamed from: y, reason: collision with root package name */
    private final ScheduledFuture f32774y;

    class a implements b {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.w(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(Object obj) {
            p.this.v(obj);
        }
    }

    interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    interface c {
        ScheduledFuture a(b bVar);
    }

    p(c cVar) {
        this.f32774y = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f32774y.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.a
    protected void c() {
        this.f32774y.cancel(y());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f32774y.getDelay(timeUnit);
    }
}
