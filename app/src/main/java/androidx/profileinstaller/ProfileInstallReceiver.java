package androidx.profileinstaller;

import Z0.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.f;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    class a implements f.c {
        a() {
        }

        @Override // androidx.profileinstaller.f.c
        public void a(int i8, Object obj) {
            f.f10734b.a(i8, obj);
        }

        @Override // androidx.profileinstaller.f.c
        public void b(int i8, Object obj) {
            f.f10734b.b(i8, obj);
            ProfileInstallReceiver.this.setResultCode(i8);
        }
    }

    static void a(f.c cVar) {
        if (Build.VERSION.SDK_INT < 24) {
            cVar.b(13, null);
        } else {
            Process.sendSignal(Process.myPid(), 10);
            cVar.b(12, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            f.k(context, new m(), new a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    f.l(context, new m(), new a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        f.c(context, new m(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            a(new a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        a aVar = new a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else {
            aVar.b(16, null);
        }
    }
}
