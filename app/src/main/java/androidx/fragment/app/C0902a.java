package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.E;
import androidx.fragment.app.w;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0902a extends E implements w.l {

    /* renamed from: t, reason: collision with root package name */
    final w f10004t;

    /* renamed from: u, reason: collision with root package name */
    boolean f10005u;

    /* renamed from: v, reason: collision with root package name */
    int f10006v;

    /* renamed from: w, reason: collision with root package name */
    boolean f10007w;

    C0902a(w wVar) {
        super(wVar.r0(), wVar.t0() != null ? wVar.t0().f().getClassLoader() : null);
        this.f10006v = -1;
        this.f10007w = false;
        this.f10004t = wVar;
    }

    @Override // androidx.fragment.app.w.l
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (w.G0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f9836i) {
            return true;
        }
        this.f10004t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.E
    public int g() {
        return r(false);
    }

    @Override // androidx.fragment.app.E
    public int h() {
        return r(true);
    }

    @Override // androidx.fragment.app.E
    public void i() {
        k();
        this.f10004t.b0(this, false);
    }

    @Override // androidx.fragment.app.E
    public void j() {
        k();
        this.f10004t.b0(this, true);
    }

    @Override // androidx.fragment.app.E
    void l(int i8, Fragment fragment, String str, int i9) {
        super.l(i8, fragment, str, i9);
        fragment.f9869K = this.f10004t;
    }

    @Override // androidx.fragment.app.E
    public E m(Fragment fragment) {
        w wVar = fragment.f9869K;
        if (wVar == null || wVar == this.f10004t) {
            return super.m(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void q(int i8) {
        if (this.f9836i) {
            if (w.G0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i8);
            }
            int size = this.f9830c.size();
            for (int i9 = 0; i9 < size; i9++) {
                E.a aVar = (E.a) this.f9830c.get(i9);
                Fragment fragment = aVar.f9848b;
                if (fragment != null) {
                    fragment.f9868J += i8;
                    if (w.G0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f9848b + " to " + aVar.f9848b.f9868J);
                    }
                }
            }
        }
    }

    int r(boolean z7) {
        if (this.f10005u) {
            throw new IllegalStateException("commit already called");
        }
        if (w.G0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new J("FragmentManager"));
            s("  ", printWriter);
            printWriter.close();
        }
        this.f10005u = true;
        if (this.f9836i) {
            this.f10006v = this.f10004t.l();
        } else {
            this.f10006v = -1;
        }
        this.f10004t.Y(this, z7);
        return this.f10006v;
    }

    public void s(String str, PrintWriter printWriter) {
        t(str, printWriter, true);
    }

    public void t(String str, PrintWriter printWriter, boolean z7) {
        String str2;
        if (z7) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f9838k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f10006v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f10005u);
            if (this.f9835h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f9835h));
            }
            if (this.f9831d != 0 || this.f9832e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9831d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9832e));
            }
            if (this.f9833f != 0 || this.f9834g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9833f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9834g));
            }
            if (this.f9839l != 0 || this.f9840m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9839l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f9840m);
            }
            if (this.f9841n != 0 || this.f9842o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9841n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f9842o);
            }
        }
        if (this.f9830c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f9830c.size();
        for (int i8 = 0; i8 < size; i8++) {
            E.a aVar = (E.a) this.f9830c.get(i8);
            switch (aVar.f9847a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f9847a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i8);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f9848b);
            if (z7) {
                if (aVar.f9850d != 0 || aVar.f9851e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f9850d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f9851e));
                }
                if (aVar.f9852f != 0 || aVar.f9853g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f9852f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f9853g));
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f10006v >= 0) {
            sb.append(" #");
            sb.append(this.f10006v);
        }
        if (this.f9838k != null) {
            sb.append(" ");
            sb.append(this.f9838k);
        }
        sb.append("}");
        return sb.toString();
    }

    void u() {
        int size = this.f9830c.size();
        for (int i8 = 0; i8 < size; i8++) {
            E.a aVar = (E.a) this.f9830c.get(i8);
            Fragment fragment = aVar.f9848b;
            if (fragment != null) {
                fragment.f9863E = this.f10007w;
                fragment.U1(false);
                fragment.T1(this.f9835h);
                fragment.W1(this.f9843p, this.f9844q);
            }
            switch (aVar.f9847a) {
                case 1:
                    fragment.Q1(aVar.f9850d, aVar.f9851e, aVar.f9852f, aVar.f9853g);
                    this.f10004t.l1(fragment, false);
                    this.f10004t.j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f9847a);
                case 3:
                    fragment.Q1(aVar.f9850d, aVar.f9851e, aVar.f9852f, aVar.f9853g);
                    this.f10004t.e1(fragment);
                    break;
                case 4:
                    fragment.Q1(aVar.f9850d, aVar.f9851e, aVar.f9852f, aVar.f9853g);
                    this.f10004t.D0(fragment);
                    break;
                case 5:
                    fragment.Q1(aVar.f9850d, aVar.f9851e, aVar.f9852f, aVar.f9853g);
                    this.f10004t.l1(fragment, false);
                    this.f10004t.p1(fragment);
                    break;
                case 6:
                    fragment.Q1(aVar.f9850d, aVar.f9851e, aVar.f9852f, aVar.f9853g);
                    this.f10004t.w(fragment);
                    break;
                case 7:
                    fragment.Q1(aVar.f9850d, aVar.f9851e, aVar.f9852f, aVar.f9853g);
                    this.f10004t.l1(fragment, false);
                    this.f10004t.n(fragment);
                    break;
                case 8:
                    this.f10004t.n1(fragment);
                    break;
                case 9:
                    this.f10004t.n1(null);
                    break;
                case 10:
                    this.f10004t.m1(fragment, aVar.f9855i);
                    break;
            }
        }
    }

    void v() {
        for (int size = this.f9830c.size() - 1; size >= 0; size--) {
            E.a aVar = (E.a) this.f9830c.get(size);
            Fragment fragment = aVar.f9848b;
            if (fragment != null) {
                fragment.f9863E = this.f10007w;
                fragment.U1(true);
                fragment.T1(w.i1(this.f9835h));
                fragment.W1(this.f9844q, this.f9843p);
            }
            switch (aVar.f9847a) {
                case 1:
                    fragment.Q1(aVar.f9850d, aVar.f9851e, aVar.f9852f, aVar.f9853g);
                    this.f10004t.l1(fragment, true);
                    this.f10004t.e1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f9847a);
                case 3:
                    fragment.Q1(aVar.f9850d, aVar.f9851e, aVar.f9852f, aVar.f9853g);
                    this.f10004t.j(fragment);
                    break;
                case 4:
                    fragment.Q1(aVar.f9850d, aVar.f9851e, aVar.f9852f, aVar.f9853g);
                    this.f10004t.p1(fragment);
                    break;
                case 5:
                    fragment.Q1(aVar.f9850d, aVar.f9851e, aVar.f9852f, aVar.f9853g);
                    this.f10004t.l1(fragment, true);
                    this.f10004t.D0(fragment);
                    break;
                case 6:
                    fragment.Q1(aVar.f9850d, aVar.f9851e, aVar.f9852f, aVar.f9853g);
                    this.f10004t.n(fragment);
                    break;
                case 7:
                    fragment.Q1(aVar.f9850d, aVar.f9851e, aVar.f9852f, aVar.f9853g);
                    this.f10004t.l1(fragment, true);
                    this.f10004t.w(fragment);
                    break;
                case 8:
                    this.f10004t.n1(null);
                    break;
                case 9:
                    this.f10004t.n1(fragment);
                    break;
                case 10:
                    this.f10004t.m1(fragment, aVar.f9854h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment w(java.util.ArrayList r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.f9830c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList r5 = r0.f9830c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.E$a r5 = (androidx.fragment.app.E.a) r5
            int r6 = r5.f9847a
            r7 = 1
            if (r6 == r7) goto Lb6
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L43
            r8 = 6
            if (r6 == r8) goto L43
            r8 = 7
            if (r6 == r8) goto Lb6
            r8 = 8
            if (r6 == r8) goto L31
            goto Lbb
        L31:
            java.util.ArrayList r6 = r0.f9830c
            androidx.fragment.app.E$a r8 = new androidx.fragment.app.E$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.f9849c = r7
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f9848b
            goto Lbb
        L43:
            androidx.fragment.app.Fragment r6 = r5.f9848b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f9848b
            if (r5 != r3) goto Lbb
            java.util.ArrayList r3 = r0.f9830c
            androidx.fragment.app.E$a r6 = new androidx.fragment.app.E$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            androidx.fragment.app.Fragment r6 = r5.f9848b
            int r8 = r6.f9874P
            int r12 = r17.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.f9874P
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList r3 = r0.f9830c
            androidx.fragment.app.E$a r15 = new androidx.fragment.app.E$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.E$a r15 = new androidx.fragment.app.E$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.f9850d
            r15.f9850d = r2
            int r2 = r5.f9852f
            r15.f9852f = r2
            int r2 = r5.f9851e
            r15.f9851e = r2
            int r2 = r5.f9853g
            r15.f9853g = r2
            java.util.ArrayList r2 = r0.f9830c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList r2 = r0.f9830c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f9847a = r7
            r5.f9849c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.Fragment r2 = r5.f9848b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0902a.w(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String x() {
        return this.f9838k;
    }

    public void y() {
        if (this.f9846s != null) {
            for (int i8 = 0; i8 < this.f9846s.size(); i8++) {
                ((Runnable) this.f9846s.get(i8)).run();
            }
            this.f9846s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment z(java.util.ArrayList r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f9830c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.f9830c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.E$a r2 = (androidx.fragment.app.E.a) r2
            int r3 = r2.f9847a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.h$b r3 = r2.f9854h
            r2.f9855i = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f9848b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f9848b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f9848b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0902a.z(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }
}
