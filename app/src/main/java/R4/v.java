package R4;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f4902a = new v();

    private v() {
    }

    private final u a(String str, int i8, int i9, boolean z7) {
        return new u(str, i8, i9, z7);
    }

    static /* synthetic */ u b(v vVar, String str, int i8, int i9, boolean z7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = 0;
        }
        if ((i10 & 8) != 0) {
            z7 = false;
        }
        return vVar.a(str, i8, i9, z7);
    }

    public final List c(Context context) {
        J6.r.e(context, "context");
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
            String str2 = runningAppProcessInfo.processName;
            J6.r.d(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new u(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, J6.r.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final u d(Context context) {
        Object obj;
        J6.r.e(context, "context");
        int myPid = Process.myPid();
        Iterator it = c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((u) obj).b() == myPid) {
                break;
            }
        }
        u uVar = (u) obj;
        return uVar == null ? b(this, e(), myPid, 0, false, 12, null) : uVar;
    }

    public final String e() {
        String processName;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            String myProcessName = Process.myProcessName();
            J6.r.d(myProcessName, "myProcessName()");
            return myProcessName;
        }
        if (i8 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String a8 = f3.o.a();
        return a8 != null ? a8 : "";
    }
}
