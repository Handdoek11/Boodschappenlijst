package j4;

import J6.r;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4.AbstractC6384F;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f38249a = new j();

    private j() {
    }

    public static /* synthetic */ AbstractC6384F.e.d.a.c c(j jVar, String str, int i8, int i9, boolean z7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = 0;
        }
        if ((i10 & 8) != 0) {
            z7 = false;
        }
        return jVar.b(str, i8, i9, z7);
    }

    private final String f() {
        String processName;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 33) {
            return (i8 < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String myProcessName = Process.myProcessName();
        r.d(myProcessName, "{\n      Process.myProcessName()\n    }");
        return myProcessName;
    }

    public final AbstractC6384F.e.d.a.c a(String str, int i8, int i9) {
        r.e(str, "processName");
        return c(this, str, i8, i9, false, 8, null);
    }

    public final AbstractC6384F.e.d.a.c b(String str, int i8, int i9, boolean z7) {
        r.e(str, "processName");
        AbstractC6384F.e.d.a.c a8 = AbstractC6384F.e.d.a.c.a().e(str).d(i8).c(i9).b(z7).a();
        r.d(a8, "builder()\n      .setProc…ltProcess)\n      .build()");
        return a8;
    }

    public final List d(Context context) {
        r.e(context, "context");
        int i8 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = AbstractC6987o.e();
        }
        List y7 = AbstractC6987o.y(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : y7) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i8) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC6987o.l(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(AbstractC6384F.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(r.a(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final AbstractC6384F.e.d.a.c e(Context context) {
        Object obj;
        r.e(context, "context");
        int myPid = Process.myPid();
        Iterator it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC6384F.e.d.a.c) obj).c() == myPid) {
                break;
            }
        }
        AbstractC6384F.e.d.a.c cVar = (AbstractC6384F.e.d.a.c) obj;
        return cVar == null ? c(this, f(), myPid, 0, false, 12, null) : cVar;
    }
}
