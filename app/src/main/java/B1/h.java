package B1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f338a;

    public h(WorkDatabase workDatabase) {
        this.f338a = workDatabase;
    }

    public static void b(Context context, g1.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j8 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j9 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            bVar.n();
            try {
                bVar.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j8)});
                bVar.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j9)});
                sharedPreferences.edit().clear().apply();
                bVar.P();
            } finally {
                bVar.Y();
            }
        }
    }

    public boolean a() {
        Long b8 = this.f338a.x().b("reschedule_needed");
        return b8 != null && b8.longValue() == 1;
    }

    public void c(boolean z7) {
        this.f338a.x().a(new A1.d("reschedule_needed", z7));
    }
}
