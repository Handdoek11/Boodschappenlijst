package N0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import y0.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b f4044a;

    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f4045a;

        /* renamed from: b, reason: collision with root package name */
        private final d f4046b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4047c = true;

        a(TextView textView) {
            this.f4045a = textView;
            this.f4046b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f4046b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f4046b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i8 = 0; i8 < inputFilterArr.length; i8++) {
                InputFilter inputFilter = inputFilterArr[i8];
                if (inputFilter instanceof d) {
                    sparseArray.put(i8, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray g8 = g(inputFilterArr);
            if (g8.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g8.size()];
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (g8.indexOfKey(i9) < 0) {
                    inputFilterArr2[i8] = inputFilterArr[i9];
                    i8++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f4045a.setFilters(a(this.f4045a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // N0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f4047c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // N0.f.b
        public boolean b() {
            return this.f4047c;
        }

        @Override // N0.f.b
        void c(boolean z7) {
            if (z7) {
                l();
            }
        }

        @Override // N0.f.b
        void d(boolean z7) {
            this.f4047c = z7;
            l();
            k();
        }

        @Override // N0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f4047c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z7) {
            this.f4047c = z7;
        }

        void l() {
            this.f4045a.setTransformationMethod(e(this.f4045a.getTransformationMethod()));
        }
    }

    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        abstract void c(boolean z7);

        abstract void d(boolean z7);

        abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    private static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final a f4048a;

        c(TextView textView) {
            this.f4048a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.f.i();
        }

        @Override // N0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f4048a.a(inputFilterArr);
        }

        @Override // N0.f.b
        public boolean b() {
            return this.f4048a.b();
        }

        @Override // N0.f.b
        void c(boolean z7) {
            if (f()) {
                return;
            }
            this.f4048a.c(z7);
        }

        @Override // N0.f.b
        void d(boolean z7) {
            if (f()) {
                this.f4048a.i(z7);
            } else {
                this.f4048a.d(z7);
            }
        }

        @Override // N0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f4048a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z7) {
        i.h(textView, "textView cannot be null");
        if (z7) {
            this.f4044a = new a(textView);
        } else {
            this.f4044a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f4044a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f4044a.b();
    }

    public void c(boolean z7) {
        this.f4044a.c(z7);
    }

    public void d(boolean z7) {
        this.f4044a.d(z7);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f4044a.e(transformationMethod);
    }
}
