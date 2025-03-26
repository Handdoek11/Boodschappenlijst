package com.google.common.util.concurrent;

import b4.h;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public abstract class b extends c {

    private static final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final Future f32694o;

        /* renamed from: s, reason: collision with root package name */
        final com.google.common.util.concurrent.a f32695s;

        a(Future future, com.google.common.util.concurrent.a aVar) {
            this.f32694o = future;
            this.f32695s = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f32695s.b(b.b(this.f32694o));
            } catch (Error e8) {
                e = e8;
                this.f32695s.a(e);
            } catch (RuntimeException e9) {
                e = e9;
                this.f32695s.a(e);
            } catch (ExecutionException e10) {
                this.f32695s.a(e10.getCause());
            }
        }

        public String toString() {
            return b4.d.a(this).c(this.f32695s).toString();
        }
    }

    public static void a(d dVar, com.google.common.util.concurrent.a aVar, Executor executor) {
        h.i(aVar);
        dVar.f(new a(dVar, aVar), executor);
    }

    public static Object b(Future future) {
        h.p(future.isDone(), "Future was expected to be done: %s", future);
        return e.a(future);
    }
}
