package B1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f336a;

    public f(WorkDatabase workDatabase) {
        this.f336a = workDatabase;
    }

    public static void a(Context context, g1.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i8 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i9 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.n();
            try {
                bVar.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i8)});
                bVar.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i9)});
                sharedPreferences.edit().clear().apply();
                bVar.P();
            } finally {
                bVar.Y();
            }
        }
    }

    private int c(String str) {
        this.f336a.c();
        try {
            Long b8 = this.f336a.x().b(str);
            int i8 = 0;
            int intValue = b8 != null ? b8.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i8 = intValue + 1;
            }
            e(str, i8);
            this.f336a.r();
            this.f336a.g();
            return intValue;
        } catch (Throwable th) {
            this.f336a.g();
            throw th;
        }
    }

    private void e(String str, int i8) {
        this.f336a.x().a(new A1.d(str, i8));
    }

    public int b() {
        int c8;
        synchronized (f.class) {
            c8 = c("next_alarm_manager_id");
        }
        return c8;
    }

    public int d(int i8, int i9) {
        synchronized (f.class) {
            int c8 = c("next_job_scheduler_id");
            if (c8 < i8 || c8 > i9) {
                e("next_job_scheduler_id", i8 + 1);
            } else {
                i8 = c8;
            }
        }
        return i8;
    }
}
