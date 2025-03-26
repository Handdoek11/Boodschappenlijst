package androidx.work.impl.foreground;

import A1.p;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import s1.e;
import s1.j;
import t1.C6789j;
import t1.InterfaceC6781b;
import w1.C6868d;
import w1.InterfaceC6867c;

/* loaded from: classes.dex */
public class a implements InterfaceC6867c, InterfaceC6781b {

    /* renamed from: B, reason: collision with root package name */
    static final String f11907B = j.f("SystemFgDispatcher");

    /* renamed from: A, reason: collision with root package name */
    private b f11908A;

    /* renamed from: o, reason: collision with root package name */
    private Context f11909o;

    /* renamed from: s, reason: collision with root package name */
    private C6789j f11910s;

    /* renamed from: t, reason: collision with root package name */
    private final C1.a f11911t;

    /* renamed from: u, reason: collision with root package name */
    final Object f11912u = new Object();

    /* renamed from: v, reason: collision with root package name */
    String f11913v;

    /* renamed from: w, reason: collision with root package name */
    final Map f11914w;

    /* renamed from: x, reason: collision with root package name */
    final Map f11915x;

    /* renamed from: y, reason: collision with root package name */
    final Set f11916y;

    /* renamed from: z, reason: collision with root package name */
    final C6868d f11917z;

    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC0198a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ WorkDatabase f11918o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f11919s;

        RunnableC0198a(WorkDatabase workDatabase, String str) {
            this.f11918o = workDatabase;
            this.f11919s = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p m8 = this.f11918o.B().m(this.f11919s);
            if (m8 == null || !m8.b()) {
                return;
            }
            synchronized (a.this.f11912u) {
                a.this.f11915x.put(this.f11919s, m8);
                a.this.f11916y.add(m8);
                a aVar = a.this;
                aVar.f11917z.d(aVar.f11916y);
            }
        }
    }

    interface b {
        void b(int i8, int i9, Notification notification);

        void c(int i8, Notification notification);

        void d(int i8);

        void stop();
    }

    a(Context context) {
        this.f11909o = context;
        C6789j k8 = C6789j.k(context);
        this.f11910s = k8;
        C1.a p8 = k8.p();
        this.f11911t = p8;
        this.f11913v = null;
        this.f11914w = new LinkedHashMap();
        this.f11916y = new HashSet();
        this.f11915x = new HashMap();
        this.f11917z = new C6868d(this.f11909o, p8, this);
        this.f11910s.m().d(this);
    }

    public static Intent a(Context context, String str, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        j.c().d(f11907B, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f11910s.f(UUID.fromString(stringExtra));
    }

    private void h(Intent intent) {
        int i8 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        j.c().a(f11907B, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f11908A == null) {
            return;
        }
        this.f11914w.put(stringExtra, new e(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f11913v)) {
            this.f11913v = stringExtra;
            this.f11908A.b(intExtra, intExtra2, notification);
            return;
        }
        this.f11908A.c(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f11914w.entrySet().iterator();
        while (it.hasNext()) {
            i8 |= ((e) ((Map.Entry) it.next()).getValue()).a();
        }
        e eVar = (e) this.f11914w.get(this.f11913v);
        if (eVar != null) {
            this.f11908A.b(eVar.c(), i8, eVar.b());
        }
    }

    private void i(Intent intent) {
        j.c().d(f11907B, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f11911t.b(new RunnableC0198a(this.f11910s.o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // w1.InterfaceC6867c
    public void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            j.c().a(f11907B, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f11910s.w(str);
        }
    }

    @Override // t1.InterfaceC6781b
    public void c(String str, boolean z7) {
        Map.Entry entry;
        synchronized (this.f11912u) {
            try {
                p pVar = (p) this.f11915x.remove(str);
                if (pVar != null ? this.f11916y.remove(pVar) : false) {
                    this.f11917z.d(this.f11916y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = (e) this.f11914w.remove(str);
        if (str.equals(this.f11913v) && this.f11914w.size() > 0) {
            Iterator it = this.f11914w.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f11913v = (String) entry.getKey();
            if (this.f11908A != null) {
                e eVar2 = (e) entry.getValue();
                this.f11908A.b(eVar2.c(), eVar2.a(), eVar2.b());
                this.f11908A.d(eVar2.c());
            }
        }
        b bVar = this.f11908A;
        if (eVar == null || bVar == null) {
            return;
        }
        j.c().a(f11907B, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(eVar.c()), str, Integer.valueOf(eVar.a())), new Throwable[0]);
        bVar.d(eVar.c());
    }

    @Override // w1.InterfaceC6867c
    public void f(List list) {
    }

    void j(Intent intent) {
        j.c().d(f11907B, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f11908A;
        if (bVar != null) {
            bVar.stop();
        }
    }

    void k() {
        this.f11908A = null;
        synchronized (this.f11912u) {
            this.f11917z.e();
        }
        this.f11910s.m().i(this);
    }

    void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    void m(b bVar) {
        if (this.f11908A != null) {
            j.c().b(f11907B, "A callback already exists.", new Throwable[0]);
        } else {
            this.f11908A = bVar;
        }
    }
}
