package androidx.work.impl.background.systemalarm;

import A1.p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import java.util.HashMap;
import java.util.Map;
import s1.j;
import t1.InterfaceC6781b;

/* loaded from: classes.dex */
public class b implements InterfaceC6781b {

    /* renamed from: u, reason: collision with root package name */
    private static final String f11853u = j.f("CommandHandler");

    /* renamed from: o, reason: collision with root package name */
    private final Context f11854o;

    /* renamed from: s, reason: collision with root package name */
    private final Map f11855s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    private final Object f11856t = new Object();

    b(Context context) {
        this.f11854o = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent d(Context context, String str, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z7);
        return intent;
    }

    static Intent e(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void g(Intent intent, int i8, e eVar) {
        j.c().a(f11853u, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.f11854o, i8, eVar).a();
    }

    private void h(Intent intent, int i8, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f11856t) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                j c8 = j.c();
                String str = f11853u;
                c8.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (this.f11855s.containsKey(string)) {
                    j.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                } else {
                    d dVar = new d(this.f11854o, i8, string, eVar);
                    this.f11855s.put(string, dVar);
                    dVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void i(Intent intent, int i8) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z7 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        j.c().a(f11853u, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i8)), new Throwable[0]);
        c(string, z7);
    }

    private void j(Intent intent, int i8, e eVar) {
        j.c().a(f11853u, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i8)), new Throwable[0]);
        eVar.g().s();
    }

    private void k(Intent intent, int i8, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        j c8 = j.c();
        String str = f11853u;
        c8.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase o8 = eVar.g().o();
        o8.c();
        try {
            p m8 = o8.B().m(string);
            if (m8 == null) {
                j.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (m8.f96b.a()) {
                j.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long a8 = m8.a();
            if (m8.b()) {
                j.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a8)), new Throwable[0]);
                a.c(this.f11854o, eVar.g(), string, a8);
                eVar.k(new e.b(eVar, a(this.f11854o), i8));
            } else {
                j.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a8)), new Throwable[0]);
                a.c(this.f11854o, eVar.g(), string, a8);
            }
            o8.r();
        } finally {
            o8.g();
        }
    }

    private void l(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        j.c().a(f11853u, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        eVar.g().x(string);
        a.a(this.f11854o, eVar.g(), string);
        eVar.c(string, false);
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // t1.InterfaceC6781b
    public void c(String str, boolean z7) {
        synchronized (this.f11856t) {
            try {
                InterfaceC6781b interfaceC6781b = (InterfaceC6781b) this.f11855s.remove(str);
                if (interfaceC6781b != null) {
                    interfaceC6781b.c(str, z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean n() {
        boolean z7;
        synchronized (this.f11856t) {
            z7 = !this.f11855s.isEmpty();
        }
        return z7;
    }

    void o(Intent intent, int i8, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i8, eVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i8, eVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            j.c().b(f11853u, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i8, eVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i8, eVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i8);
        } else {
            j.c().h(f11853u, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
