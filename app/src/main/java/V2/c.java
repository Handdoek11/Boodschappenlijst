package V2;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.C0377k;
import A3.InterfaceC0369c;
import A3.InterfaceC0371e;
import A3.InterfaceC0375i;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.AbstractC6248a;
import q.C6407k;

/* loaded from: classes.dex */
public class c {

    /* renamed from: h, reason: collision with root package name */
    private static int f5560h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f5561i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f5562j = new Executor() { // from class: V2.t
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f5563k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f5565b;

    /* renamed from: c, reason: collision with root package name */
    private final r f5566c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f5567d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f5569f;

    /* renamed from: g, reason: collision with root package name */
    private l f5570g;

    /* renamed from: a, reason: collision with root package name */
    private final C6407k f5564a = new C6407k();

    /* renamed from: e, reason: collision with root package name */
    private final Messenger f5568e = new Messenger(new i(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f5565b = context;
        this.f5566c = new r(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5567d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ AbstractC0376j e(Bundle bundle) {
        return m(bundle) ? AbstractC0379m.e(null) : AbstractC0379m.e(bundle);
    }

    static /* bridge */ /* synthetic */ void g(c cVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        cVar.f5570g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f5569f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f5563k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        cVar.l(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (cVar.f5564a) {
                        for (int i8 = 0; i8 < cVar.f5564a.size(); i8++) {
                            try {
                                cVar.l((String) cVar.f5564a.g(i8), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                cVar.l(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final AbstractC0376j i(Bundle bundle) {
        final String j8 = j();
        final C0377k c0377k = new C0377k();
        synchronized (this.f5564a) {
            this.f5564a.put(j8, c0377k);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f5566c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f5565b, intent);
        intent.putExtra("kid", "|ID|" + j8 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f5568e);
        if (this.f5569f != null || this.f5570g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f5569f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f5570g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.f5566c.b() == 2) {
            this.f5565b.sendBroadcast(intent);
        } else {
            this.f5565b.startService(intent);
        }
        final ScheduledFuture<?> schedule = this.f5567d.schedule(new Runnable() { // from class: V2.g
            @Override // java.lang.Runnable
            public final void run() {
                if (c0377k.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c0377k.a().d(f5562j, new InterfaceC0371e() { // from class: V2.h
            @Override // A3.InterfaceC0371e
            public final void a(AbstractC0376j abstractC0376j) {
                this.f5574a.h(j8, schedule, abstractC0376j);
            }
        });
        return c0377k.a();
    }

    private static synchronized String j() {
        String num;
        synchronized (c.class) {
            int i8 = f5560h;
            f5560h = i8 + 1;
            num = Integer.toString(i8);
        }
        return num;
    }

    private static synchronized void k(Context context, Intent intent) {
        synchronized (c.class) {
            try {
                if (f5561i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f5561i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC6248a.f39571a);
                }
                intent.putExtra("app", f5561i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f5564a) {
            try {
                C0377k c0377k = (C0377k) this.f5564a.remove(str);
                if (c0377k != null) {
                    c0377k.c(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public AbstractC0376j a() {
        return this.f5566c.a() >= 241100000 ? com.google.android.gms.cloudmessaging.l.b(this.f5565b).d(5, Bundle.EMPTY).k(f5562j, new InterfaceC0369c() { // from class: V2.f
            @Override // A3.InterfaceC0369c
            public final Object a(AbstractC0376j abstractC0376j) {
                Intent intent = (Intent) ((Bundle) abstractC0376j.o()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
            }
        }) : AbstractC0379m.d(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public AbstractC0376j b(a aVar) {
        if (this.f5566c.a() < 233700000) {
            return AbstractC0379m.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", aVar.B0());
        Integer C02 = aVar.C0();
        if (C02 != null) {
            bundle.putInt("google.product_id", C02.intValue());
        }
        return com.google.android.gms.cloudmessaging.l.b(this.f5565b).c(3, bundle);
    }

    public AbstractC0376j c(final Bundle bundle) {
        return this.f5566c.a() < 12000000 ? this.f5566c.b() != 0 ? i(bundle).m(f5562j, new InterfaceC0369c() { // from class: V2.u
            @Override // A3.InterfaceC0369c
            public final Object a(AbstractC0376j abstractC0376j) {
                return this.f5594a.f(bundle, abstractC0376j);
            }
        }) : AbstractC0379m.d(new IOException("MISSING_INSTANCEID_SERVICE")) : com.google.android.gms.cloudmessaging.l.b(this.f5565b).d(1, bundle).k(f5562j, new InterfaceC0369c() { // from class: V2.e
            @Override // A3.InterfaceC0369c
            public final Object a(AbstractC0376j abstractC0376j) {
                if (abstractC0376j.s()) {
                    return (Bundle) abstractC0376j.o();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(abstractC0376j.n())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", abstractC0376j.n());
            }
        });
    }

    public AbstractC0376j d(boolean z7) {
        if (this.f5566c.a() < 241100000) {
            return AbstractC0379m.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z7);
        return com.google.android.gms.cloudmessaging.l.b(this.f5565b).c(4, bundle);
    }

    final /* synthetic */ AbstractC0376j f(Bundle bundle, AbstractC0376j abstractC0376j) {
        return (abstractC0376j.s() && m((Bundle) abstractC0376j.o())) ? i(bundle).u(f5562j, new InterfaceC0375i() { // from class: V2.s
            @Override // A3.InterfaceC0375i
            public final AbstractC0376j a(Object obj) {
                return c.e((Bundle) obj);
            }
        }) : abstractC0376j;
    }

    final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, AbstractC0376j abstractC0376j) {
        synchronized (this.f5564a) {
            this.f5564a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
