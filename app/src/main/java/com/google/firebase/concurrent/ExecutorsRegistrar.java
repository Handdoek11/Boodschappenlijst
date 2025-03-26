package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import f4.InterfaceC5782a;
import f4.InterfaceC5783b;
import f4.InterfaceC5784c;
import f4.InterfaceC5785d;
import g4.B;
import g4.C5807c;
import g4.u;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final u f32723a = new u(new H4.b() { // from class: h4.b
        @Override // H4.b
        public final Object get() {
            return ExecutorsRegistrar.p();
        }
    });

    /* renamed from: b, reason: collision with root package name */
    static final u f32724b = new u(new H4.b() { // from class: h4.c
        @Override // H4.b
        public final Object get() {
            return ExecutorsRegistrar.q();
        }
    });

    /* renamed from: c, reason: collision with root package name */
    static final u f32725c = new u(new H4.b() { // from class: h4.d
        @Override // H4.b
        public final Object get() {
            return ExecutorsRegistrar.r();
        }
    });

    /* renamed from: d, reason: collision with root package name */
    static final u f32726d = new u(new H4.b() { // from class: h4.e
        @Override // H4.b
        public final Object get() {
            return ExecutorsRegistrar.s();
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i8 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i8 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i8) {
        return new b(str, i8, null);
    }

    private static ThreadFactory k(String str, int i8, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i8, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(g4.e eVar) {
        return (ScheduledExecutorService) f32723a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(g4.e eVar) {
        return (ScheduledExecutorService) f32725c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(g4.e eVar) {
        return (ScheduledExecutorService) f32724b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(g4.e eVar) {
        return h4.l.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f32726d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C5807c.d(B.a(InterfaceC5782a.class, ScheduledExecutorService.class), B.a(InterfaceC5782a.class, ExecutorService.class), B.a(InterfaceC5782a.class, Executor.class)).f(new g4.h() { // from class: h4.f
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return ExecutorsRegistrar.l(eVar);
            }
        }).d(), C5807c.d(B.a(InterfaceC5783b.class, ScheduledExecutorService.class), B.a(InterfaceC5783b.class, ExecutorService.class), B.a(InterfaceC5783b.class, Executor.class)).f(new g4.h() { // from class: h4.g
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return ExecutorsRegistrar.m(eVar);
            }
        }).d(), C5807c.d(B.a(InterfaceC5784c.class, ScheduledExecutorService.class), B.a(InterfaceC5784c.class, ExecutorService.class), B.a(InterfaceC5784c.class, Executor.class)).f(new g4.h() { // from class: h4.h
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return ExecutorsRegistrar.n(eVar);
            }
        }).d(), C5807c.c(B.a(InterfaceC5785d.class, Executor.class)).f(new g4.h() { // from class: h4.i
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return ExecutorsRegistrar.o(eVar);
            }
        }).d());
    }
}
