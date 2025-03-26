package V2;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.InterfaceC0371e;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import g3.ThreadFactoryC5803b;
import j$.util.Objects;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static SoftReference f5558a;

    /* renamed from: b, reason: collision with root package name */
    private static SoftReference f5559b;

    private final int e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    protected Executor a() {
        ExecutorService executorService;
        synchronized (b.class) {
            try {
                SoftReference softReference = f5558a;
                executorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService == null) {
                    n3.e.a();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC5803b("firebase-iid-executor")));
                    f5558a = new SoftReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    protected abstract int b(Context context, a aVar);

    protected abstract void c(Context context, Bundle bundle);

    final /* synthetic */ void d(Intent intent, final Context context, boolean z7, BroadcastReceiver.PendingResult pendingResult) {
        Executor executor;
        int i8;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i8 = e(context, intent2);
            } else if (intent.getExtras() == null) {
                i8 = 500;
            } else {
                final a aVar = new a(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (b.class) {
                    try {
                        SoftReference softReference = f5559b;
                        executor = softReference != null ? (Executor) softReference.get() : null;
                        if (executor == null) {
                            n3.e.a();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5803b("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            f5559b = new SoftReference(executor);
                        }
                    } finally {
                    }
                }
                executor.execute(new Runnable() { // from class: V2.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0376j c8;
                        a aVar2 = aVar;
                        if (TextUtils.isEmpty(aVar2.B0())) {
                            c8 = AbstractC0379m.e(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("google.message_id", aVar2.B0());
                            Integer C02 = aVar2.C0();
                            if (C02 != null) {
                                bundle.putInt("google.product_id", C02.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            c8 = com.google.android.gms.cloudmessaging.l.b(context2).c(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        c8.d(new Executor() { // from class: V2.m
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new InterfaceC0371e() { // from class: V2.n
                            @Override // A3.InterfaceC0371e
                            public final void a(AbstractC0376j abstractC0376j) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int b8 = b(context, aVar);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e8) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e8.toString()));
                }
                i8 = b8;
            }
            if (z7 && pendingResult != null) {
                pendingResult.setResultCode(i8);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        a().execute(new Runnable() { // from class: V2.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f5584o.d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}
